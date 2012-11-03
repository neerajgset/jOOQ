/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_author", schema = "public")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> {

	private static final long serialVersionUID = -460896797;

	/**
	 * The table column <code>public.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID, value);
	}

	/**
	 * The table column <code>public.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID);
	}

	/**
	 * The table column <code>public.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID)))
			.fetch();
	}

	/**
	 * The table column <code>public.t_author.first_name</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME, value);
	}

	/**
	 * The table column <code>public.t_author.first_name</code>
	 */
	@javax.persistence.Column(name = "first_name", length = 50)
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME);
	}

	/**
	 * The table column <code>public.t_author.last_name</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME, value);
	}

	/**
	 * The table column <code>public.t_author.last_name</code>
	 */
	@javax.persistence.Column(name = "last_name", nullable = false, length = 50)
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME);
	}

	/**
	 * The table column <code>public.t_author.date_of_birth</code>
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>public.t_author.date_of_birth</code>
	 */
	@javax.persistence.Column(name = "date_of_birth")
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>public.t_author.year_of_birth</code>
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>public.t_author.year_of_birth</code>
	 */
	@javax.persistence.Column(name = "year_of_birth", precision = 32)
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>public.t_author.address</code>
	 */
	public void setAddress(org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS, value);
	}

	/**
	 * The table column <code>public.t_author.address</code>
	 */
	@javax.persistence.Column(name = "address")
	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5(), field6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5(), value6());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord> field6() {
		return org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ADDRESS;
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
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord value6() {
		return getAddress();
	}
}
