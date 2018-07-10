package com.jiabian.cache;

public class RedisEnum {

	public enum valueType {
		NONE_TYPE(String.valueOf("none")),     // key不存在
		STRING_TYPE(String.valueOf("string")), // 字符串
		LIST_TYPE(String.valueOf("list")),     // 列表
		SET_TYPE(String.valueOf("set")),       // 集合
		ZSET_TYPE(String.valueOf("zset")),     // 有序集
		HASH_TYPE(String.valueOf("hash"));     // 哈希表
		
		
		private final String value;

		private valueType(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}
	
}
