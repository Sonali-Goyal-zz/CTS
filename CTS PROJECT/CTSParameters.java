import java.awt.*;

public class CTSParameters {

	public static int DELAY;
	public static int NUM_OF_TRAINS;
	public static int DIRECTION;
	public static int MIN_INSERTION_TIME;
	public static int MAX_INSERTION_TIME;
	private int[] parValues;
	private String[] parNames;

	public CTSParameters() {
		parValues = new int[5];
		parNames = new String[5];
		NUM_OF_TRAINS=CTSDefParameters.DEF_NUM_OF_TRAINS;
		DELAY=CTSDefParameters.DEF_DELAY;
		DIRECTION=CTSDefParameters.DEF_DIRECTION;
		MIN_INSERTION_TIME=CTSDefParameters.MIN_INSERTION_TIME;
		MAX_INSERTION_TIME=CTSDefParameters.MAX_INSERTION_TIME;
		// setup the names
		parNames[0] = "NUM_OF_TRAINS";
		parNames[1] = "DELAY";
		parNames[2] = "DIRECTION";
		parNames[3] = "MIN_INSERTION_TIME";
		parNames[4] = "MAX_INSERTION_TIME";
		parValues[0]=NUM_OF_TRAINS;
		parValues[1]=DELAY;
		parValues[2]=DIRECTION;
		parValues[3]=MIN_INSERTION_TIME;
		parValues[4]=MAX_INSERTION_TIME;
	}

    /**
     *  Set the parameters.
     *
     *  @param par: an array containing the parameters.
     */

        public void setParameters(int[] par) {
		parValues=par;
		NUM_OF_TRAINS=parValues[0];
		DELAY=parValues[1];
		DIRECTION=parValues[2];
		MIN_INSERTION_TIME=parValues[3];
		MAX_INSERTION_TIME=parValues[4];
	}


    /**
     *  Returns the value of the specified parameter.
     *
     *  @param pos: the parameter position in the stored array.
     *  @return an integer presenting the value of the parameter.
     */

        public int getParValue(int pos) {
		return parValues[pos];
	}


    /**
     *  Returns the name of the specified parameter.
     *
     *  @param pos: the parameter position in the stored array.
     *  @return a String specifying the name of the parameter.
     */

        public String getParName(int pos) {
		return parNames[pos];
	}
}
 // end of CTSparameters
