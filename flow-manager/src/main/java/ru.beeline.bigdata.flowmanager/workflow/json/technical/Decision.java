package ru.beeline.bigdata.flowmanager.workflow.json.technical;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by NSkovpin on 03.08.2016.
 */
public class Decision {

    private String condition;

    private String value;

    private String ref;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }


    public String checkCondition(Object input) {
        DecisionEnum decisionEnum = DecisionEnum.findByKey(condition);

        switch (decisionEnum) {
            case EQUALS: {
                if (input.equals(value)) {
                    return ref;
                }
                break;
            }
            case GREATER: {
                Double valueDouble = parseStringToDouble(value);
                Double inputDouble = getDoubleValue(input);

                if (valueDouble != null && inputDouble != null) {
                    if (inputDouble > valueDouble) {
                        return ref;
                    }
                }
                break;
            }
            case LOWER: {
                Double valueDouble = parseStringToDouble(value);
                Double inputDouble = getDoubleValue(input);

                if (valueDouble != null && inputDouble != null) {
                    if (inputDouble < valueDouble) {
                        return ref;
                    }
                }
                break;
            }
            case SAME: {
                Double valueDouble = parseStringToDouble(value);
                Double inputDouble = getDoubleValue(input);

                if (valueDouble != null && inputDouble != null) {
                    if (inputDouble == valueDouble) {
                        return ref;
                    }
                }
                break;
            }
            case GREATER_SAME: {
                Double valueDouble = parseStringToDouble(value);
                Double inputDouble = getDoubleValue(input);

                if (valueDouble != null && inputDouble != null) {
                    if (inputDouble >= valueDouble) {
                        return ref;
                    }
                }
                break;
            }
            case LOWER_SAME: {
                Double valueDouble = parseStringToDouble(value);
                Double inputDouble = getDoubleValue(input);

                if (valueDouble != null && inputDouble != null) {
                    if (inputDouble <= valueDouble) {
                        return ref;
                    }
                }
                break;
            }
            case IS: {
                Boolean boolValue = Boolean.parseBoolean(value);
                if (input instanceof Boolean) {
                    if (((Boolean) input).booleanValue() == boolValue.booleanValue()) {
                        return ref;
                    }
                    break;
                }
            }
            default: {
                return null;
            }
        }
        return null;
    }

    public static Double getDoubleValue(Object input) {
        Double doubleValue = null;
        if (input instanceof Number || Number.class.isInstance(input)) {
            if (input instanceof Integer || Integer.class.isInstance(input)) {
                System.out.println("Value is integer");
                Integer integerValue = (Integer) input;
                doubleValue = integerValue.doubleValue();
            } else if (input instanceof Float || Float.class.isInstance(input)) {
                System.out.println("Value is float");
                Float floatValue = (Float) input;
                doubleValue = floatValue.doubleValue();
            } else if (input instanceof Byte || Byte.class.isInstance(input)) {
                System.out.println("Value is byte");
                Byte byteValue = (Byte) input;
                doubleValue = byteValue.doubleValue();
            } else if (input instanceof Short || Short.class.isInstance(input)) {
                System.out.println("Value is short");
                Short shortValue = (Short) input;
                doubleValue = shortValue.doubleValue();
            } else if (input instanceof Double || Double.class.isInstance(input)) {
                System.out.println("Value is double");
                doubleValue = (Double) input;
            }
        }
        return doubleValue;
    }

    public static Double parseStringToDouble(String str) {
        String s = replaceComa(str);
        Double doubleValue = null;

        try {
            doubleValue = Double.parseDouble(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doubleValue;
    }

    public static String replaceComa(String str) {
        if (str.contains(",")) {
            str = str.replaceAll(",", "\\.");
        }
        return str;
    }


    public enum DecisionEnum {

        EQUALS("equals"),
        GREATER(">"),
        LOWER("<"),
        SAME("=="),
        GREATER_SAME(">="),
        LOWER_SAME("<="),
        IS("is");

        private String value;

        DecisionEnum(String value) {
            this.value = value;
        }

        private static final Map<String, DecisionEnum> map;

        static {
            map = new HashMap<String, DecisionEnum>();
            for (DecisionEnum v : DecisionEnum.values()) {
                map.put(v.value, v);
            }
        }

        public static DecisionEnum findByKey(String value) {
            return map.get(value);
        }

    }
}
