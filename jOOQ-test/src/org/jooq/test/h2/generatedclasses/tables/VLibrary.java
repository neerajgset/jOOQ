/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -1787332623;

	/**
	 * The singleton instance of <code>PUBLIC.V_LIBRARY</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.h2.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.V_LIBRARY.AUTHOR</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * The table column <code>PUBLIC.V_LIBRARY.TITLE</code>
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}
}
