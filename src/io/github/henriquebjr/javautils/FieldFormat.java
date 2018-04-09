package io.github.henriquebjr.javautils;

public class FieldFormat {
	public static String cpf(String value) {
        String num = extractNumber(value);
        return num.replaceAll("([0-9]{3})([0-9]{3})([0-9]{3})([0-9]{2})", "$1.$2.$3-$4");
    }

    public static String cnpj(String value) {
        String num = extractNumber(value);
        return num.replaceAll("([0-9]{2})([0-9]{3})([0-9]{3})([0-9]{4})([0-9]{2})", "$1.$2.$3/$4-$5");
    }

    public static String cep(String value) {
        String num = extractNumber(value);
        return num.replaceAll("([0-9]{5})([0-9]{3})", "$1-$2");
    }

    public static String phone(String value) {
        String num = extractNumber(value);
        return num.replaceAll("([0-9]{2})([0-9]{4})([0-9]{4})", "($1) $2-$3");
    }

    public static String cellphone(String value) {
        String num = extractNumber(value);
        return num.replaceAll("([0-9]{2})([0-9]{5})([0-9]{4})", "($1) $2-$3");
    }

    public static String carPlate(String value) {
        return value.replaceAll("([a-zA-Z]{3})([0-9]{4})", "$1-$2");
    }

    private static String extractNumber(String value) {
        return value.replaceAll("[^0-9]", "");
    }
}
