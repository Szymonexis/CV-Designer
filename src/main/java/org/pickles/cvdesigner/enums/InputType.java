package org.pickles.cvdesigner.enums;

public enum InputType {
    NAME("name"),
    EMAIL("email"),
    TELEPHONE("telephone"),
    COUNTRY("country"),
    CAPITALIZED("capitalized"),
    NIP("nip");

    public final String value;

    InputType(String value) {
        this.value = value;
    }
}
