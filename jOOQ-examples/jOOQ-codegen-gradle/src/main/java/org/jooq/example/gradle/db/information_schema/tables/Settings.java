/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Settings extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord> {

	private static final long serialVersionUID = -50974832;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.SETTINGS</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Settings SETTINGS = new org.jooq.example.gradle.db.information_schema.tables.Settings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.SETTINGS.NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SETTINGS.VALUE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
	 */
	public Settings() {
		this("SETTINGS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.SETTINGS</code> table reference
	 */
	public Settings(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Settings.SETTINGS);
	}

	private Settings(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Settings(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SettingsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Settings as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Settings(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Settings rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Settings(name, null);
	}
}