/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 1608377907;

	/**
	 * The singleton instance of <code>TEST.T_BOOK_TO_BOOK_STORE</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord.class;
	}

	/**
	 * The book store name
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_BS_NAME
	 * FOREIGN KEY (BOOK_STORE_NAME)
	 * REFERENCES TEST.T_BOOK_STORE (NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_B2BS_B_ID
	 * FOREIGN KEY (BOOK_ID)
	 * REFERENCES TEST.T_BOOK (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The number of books on stock
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this);

	public TBookToBookStore() {
		super("T_BOOK_TO_BOOK_STORE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public TBookToBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_B2BS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_B2BS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_B2BS_BS_NAME, org.jooq.test.oracle.generatedclasses.test.Keys.FK_B2BS_B_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore(alias);
	}
}
