/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_64_69", schema = "public")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 842272692;

	/**
	 * The table column <code>public.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * The table column <code>public.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * The table column <code>public.x_test_case_64_69.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, Short.class)))
			.fetch();
	}

	/**
	 * The table column <code>public.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * The table column <code>public.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "unused_id", precision = 32)
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord 
	 * XUnusedRecord}
	 */
	public void setUnusedId(org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value.getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID));
		}
	}

	/**
	 * The table column <code>public.x_test_case_64_69.unused_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69a
	 * FOREIGN KEY (unused_id)
	 * REFERENCES public.x_unused (id)
	 * </pre></code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getUnusedId();
	}
}
