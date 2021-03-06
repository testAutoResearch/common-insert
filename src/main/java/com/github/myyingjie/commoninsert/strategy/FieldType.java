package com.github.myyingjie.commoninsert.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * created by Yingjie Zheng at 2019-09-27 14:28
 */
public enum  FieldType implements ConvertStrategy {


    INTEGER("Integer"){
        @Override
        public Object convert(String value) {
            return Integer.parseInt(value);
        }
    },

    LONG("Long"){
        @Override
        public Object convert(String value) {

            return Long.parseLong(value);
        }
    },

    DATE("Date"){
        @Override
        public Object convert(String value) {
            return "'" + value + "'";
        }
    },

    DATETIME("DateTime"){
        @Override
        public Object convert(String value) {
            return "'" + value + "'";
        }
    },

    STRING("String"){
        @Override
        public Object convert(String value) {
            return "'"+value+"'";
        }
    },

    DOUBLE("Double"){
        @Override
        public Object convert(String value) {
            return Double.parseDouble(value);
        }
    },

    DECIMAL("Decimal"){
        @Override
        public Object convert(String value) {
            return value;
        }
    };


    private String value;

    final static Map<String,FieldType> map;

    FieldType(String value){
        this.value =value;
    }
    static {
        map = new HashMap<>();
        FieldType[] values = FieldType.values();
        for (FieldType fieldType : values) {
            map.put(fieldType.value, fieldType);
        }
    }

    public String getValue(){
        return this.value;
    }


    public static FieldType getByValue(String typeValue){
        return map.get(typeValue);
    }

}
