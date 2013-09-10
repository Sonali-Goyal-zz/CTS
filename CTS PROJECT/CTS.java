public class CTS { 

	// variables

        private CTSParameters ctsp;
        private CTSScreen     ctsScreen;
        private CTSEngine     ctsEngine;
        private CTSStats      stats;

	/**
         * Constructor of this class.
        **/

        public CTS() {
                ctsp      = new CTSParameters();
                stats     = new CTSStats(ctsp);
		ctsScreen = new CTSScreen(ctsp,this,stats);
		ctsEngine = new CTSEngine(ctsp,ctsScreen,stats);
	}

    /**
     *  Starts the simulation.
    **/

        public void start() {
		ctsEngine.start();
		ctsEngine.setTimer('s');
	}

    /**
     *  Restarts the simulation.
    **/
	public void restart() {
		ctsEngine.setTimer('s');
	}

    /**
     *  Pause the simulation.
    **/

        public void pause() {
		ctsEngine.setTimer('p');
	}

    /**
     *  Sets the station status to be true or false.
     *
     *  @param st: The station number.
     *  @param status: The status.
    **/

        public void setStationStatus(int st,boolean status) {
		ctsEngine.setStationStatus(st,status);
	}

    /**
     * The main method of this class.
     *
     * @param: The arguments.
    **/

        public static void main(String args[]){
		try {
			CTS Obj = new CTS();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

        // end of main method.
}

// end of class CTS.
