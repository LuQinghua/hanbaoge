package org.mybatis.def;

import org.mybatis.generator.api.ShellRunner;

public class Basic {

	public static void main(String[] args) {

		String config = Basic.class.getResource("/basic.xml").getFile();
		// String config =
		// MsqlStartTest.class.getResource("/mysql_base.xml").getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);  
	}

}
