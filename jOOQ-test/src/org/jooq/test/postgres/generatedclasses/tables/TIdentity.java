/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentity extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> {

	private static final long serialVersionUID = -1982368536;

	/**
	 * The singleton instance of <code>public.t_identity</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TIdentity T_IDENTITY = new org.jooq.test.postgres.generatedclasses.tables.TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord.class;
	}

	/**
	 * The table column <code>public.t_identity.id</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.t_identity.val</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> VAL = createField("val", org.jooq.impl.SQLDataType.INTEGER, this);

	public TIdentity() {
		super("t_identity", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public TIdentity(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TIdentity.T_IDENTITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TIdentityRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_T_IDENTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TIdentity as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TIdentity(alias);
	}
}
