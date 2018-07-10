package com.jiabian.util;

public class PathUtils {
	public static String getBasePath() {

		return (String) MyServletContextListener.getServletContext()
				.getAttribute("basePath");
	}
}
