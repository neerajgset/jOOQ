/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FTables4 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> {

	private static final long serialVersionUID = -146584213;


	/**
	 * The procedure parameter <code>TEST.F_TABLES4.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * The procedure parameter <code>TEST.F_TABLES4.IN_TABLE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> IN_TABLE = createParameter("IN_TABLE", org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FTables4() {
		super("F_TABLES4", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.udt.UBookType.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter IN value to the routine
	 */
	public void setInTable(org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.FTables4.IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInTable(org.jooq.Field<org.jooq.test.oracle.generatedclasses.test.udt.records.UBookTableRecord> field) {
		setField(IN_TABLE, field);
	}
}
