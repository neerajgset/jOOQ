/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public enum UCountry implements org.jooq.EnumType {

	Brazil("Brazil"),

	England("England"),

	Germany("Germany"),

	;

	private final java.lang.String literal;

	private UCountry(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "u_country";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
