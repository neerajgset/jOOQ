/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Object[]> {

	private static final long serialVersionUID = 637429293;


	/**
	 * The procedure parameter <code>PUBLIC.F_ARRAYS2.RETURN_VALUE</code>
	 * <p>
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * The procedure parameter <code>PUBLIC.F_ARRAYS2.P1</code>
	 * <p>
	 * The SQL type of this item (ARRAY) could not be mapped.<br/>
	 * Deserialising this field might not work!
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> P1 = createParameter("P1", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays2() {
		super("F_ARRAYS2", org.jooq.test.h2.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Object[] value) {
		setValue(org.jooq.test.h2.generatedclasses.routines.FArrays2.P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.lang.Object[]> field) {
		setField(P1, field);
	}
}
