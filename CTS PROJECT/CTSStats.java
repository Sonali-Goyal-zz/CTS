
import java.util.*;

public class CTSStats {

	private ArrayList[][][][] trainsStats;
	private int[][][] stationStats;
	private CTSParameters ctsp;
	private int numOfTrains;

    /**
     *  Constructor
     *
     *  @param ctsP The parameters of this simulation.
     */
	public CTSStats(CTSParameters ctsP) {
		ctsp=ctsP;
		numOfTrains=ctsp.NUM_OF_TRAINS;
		trainsStats = new ArrayList[numOfTrains][4][2][2];
		stationStats = new int[4][2][3];
	}


    /**
     *  Sets some actions related to the beggining of this application
     */
	public void setStartup() {
		numOfTrains=ctsp.NUM_OF_TRAINS;
		trainsStats = new ArrayList[numOfTrains][4][2][2];
		for(int i=0; i<numOfTrains; i++) {
			for (int x=0; x<4; x++) {
				for (int y=0; y<2; y++) {
					for (int z=0; z<2; z++) {
						trainsStats[i][x][y][z] = new ArrayList();
						trainsStats[i][x][y][z].add(new Integer(0));
					}
				}
			}
		}
	}


    /**
     *  Sets the stats.
     *
     *  @param stsType The type of this train
     *  @param stationNo The station number
     *  @param plat The current plat
     *  @param stationNo The type of stats.
     *  @param statsNo The number of station.
     *  @param trainNo The number of the train.
     */
	synchronized public void setStats(int stsType, int stationNo, int plat, int type, int statsNum, int trainNo) {
		switch (stsType) {
			case 0: trainsStats[trainNo][stationNo][plat][type].add(new Integer(statsNum)); break;
			case 1: stationStats[stationNo][plat][type] += statsNum; break;
		}
	}


    /**
     *  Returns the stats.
     *
     *  @param stationNo The station number
     *  @param plat The current plat
     *  @param type The type of stats.
     *
     *  @return a String representing the value of the desirable stat.
     */
	synchronized public String getStats(int stationNo, int plat, char type) {
		String s="";
		switch(type) {
			case 'p': s=Integer.toString(stationStats[stationNo][plat][0]); break;
			case 't': s=Integer.toString(stationStats[stationNo][0][0]+stationStats[stationNo][1][0]); break;
			case 'e': s=Integer.toString(stationStats[stationNo][0][2]+stationStats[stationNo][1][2]); break;
		}
		return s;
	}

    /**
     *  Returns stats.
     *
     *  @param stationNo The station number
     *  @param plat The current plat
     *  @param type The type of stats.
     *
     *  @return a String representing the value of the desirable stat.
     */
	synchronized public String getPanelStats(int trainNo, int stationNo, int plat, int type) {
		Integer anInt = (Integer) trainsStats[trainNo][stationNo][plat][type].get(trainsStats[trainNo][stationNo][plat][type].size()-1);
		return anInt.toString();
	}
} // end of CTSStats class.
