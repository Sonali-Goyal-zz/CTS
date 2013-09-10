import java.awt.*;

public abstract class CTSDefParameters {

	/* ========================  BASIC SIM PARAMETERS ============================== */
	public static final int MIN_INSERTION_TIME=3;
	public static final int MAX_INSERTION_TIME=6;
	public static final int STOP_ATSTATION_TIME=3;
	public static final int MAX_NUMOF_TRAINS=25;
	public static final int MIN_DELAY=0;
	public static final int MAX_DELAY=400;   // the maximun value of cycle interval.

	/* ========================  TIMING AND OTHER FLAG PARAMETERS ============================== */
	public static final int DEF_DELAY=30;
	public static final int DELAY_FLAG=60; // counted in cycles.
	public static final int MAX_WAIT_TIME=160; // counted in cycles.

	/* ========================  TRAIN PARAMETERS ============================== */
	public static final int DEF_NUM_OF_TRAINS=25;
	public static final int DEF_DIRECTION=0;

	/* ========================  COLOR PARAMETERS ============================== */
	public static final Color BACK_COLOR = new Color(106,65,19);
	public static final Color MAP_BACK_COLOR = new Color(139,105,20);
}
