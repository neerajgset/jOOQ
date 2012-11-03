/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1612625924;

	/**
	 * The singleton instance of <code>public.t_language</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.postgres.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The table column <code>public.t_language.cd</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>public.t_language.description</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.t_language.description_english</code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.t_language.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	public TLanguage() {
		super("t_language", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	public TLanguage(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TLanguage as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TLanguage(alias);
	}
}
