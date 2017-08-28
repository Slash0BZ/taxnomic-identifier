/**
 * 
 */
package edu.illinois.cs.cogcomp.cikm09.learning;

/**
 * @author dxquang
 * May 22, 2009
 */
public class Constants {

	public static final double NO_TITLE_E1 = -1.0;
	public static final double NO_TITLE_E2 = -2.0;
	public static final double NO_TITLE_E1E2 = -3.0;

	public static final String FILE_CLASS_CLUSTER = "class-cluster.txt";

	public static final int FROM_E1_TO_E2 = 1;
	public static final int FROM_E2_TO_E1 = 2;

	public static final int NONE = 0;
	public static final int ANCESTOR_E1_TO_E2 = 1;
	public static final int ANCESTOR_E2_TO_E1 = 2;
	public static final int COUSIN = 3;

	public static final double INC_STEP_WEIGHT = 0.05;
	public static final double INC_STEP_THRES = 0.05;

	public static final int INPUT_TYPE_GOLD = 0;
	public static final int INPUT_TYPE_PREDICT = 1;
	public static final int INPUT_TYPE_INTERMEDIATE = 2;

	public static double learningRate = 0.5;
	public static double learningThreshold = 0;
	public static double learningThickness = 0.5;
}
