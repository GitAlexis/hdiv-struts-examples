/*
 * Copyright 2004-2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hdiv.taglib.html;

import java.util.Locale;

import javax.servlet.jsp.PageContext;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.apache.cactus.JspTestCase;
import org.apache.struts.Globals;
import org.apache.struts.taglib.html.Constants;
import org.hdiv.dataComposer.IDataComposer;
import org.hdiv.taglib.SimpleBeanForTesting;
import org.hdiv.util.HDIVUtil;

/**
 * Suite of unit tests for the <code>org.hdiv.taglib.html.RadioTagHDIV</code>
 * class.
 */
public class RadioTag1Test extends JspTestCase {

	private IDataComposer dataComposer;


	/**
	 * Defines the testcase name for JUnit.
	 * 
	 * @param theName the testcase's name.
	 */
	public RadioTag1Test(String theName) {
		super(theName);
	}

	/**
	 * Start the tests.
	 * 
	 * @param theArgs the arguments. Not used
	 */
	public static void main(String[] theArgs) {
		junit.awtui.TestRunner.main(new String[] { RadioTag1Test.class.getName() });
	}

	/**
	 * @return a test suite (<code>TestSuite</code>) that includes all methods
	 *         starting with "test"
	 */
	public static Test suite() {
		// All methods starting with "test" will be executed in the test suite.
		return new TestSuite(RadioTag1Test.class);
	}

	protected void setUp() throws Exception {

		super.setUp();
		this.dataComposer = (IDataComposer) HDIVUtil.getDataComposer();
		this.dataComposer.beginRequest("POST", "/testFormTag.do");
	}

	private void runMyTest(String whichTest, String locale) throws Exception {

		pageContext.setAttribute(Globals.LOCALE_KEY, new Locale(locale, locale),
									PageContext.SESSION_SCOPE);
		pageContext.setAttribute(Constants.BEAN_KEY, new SimpleBeanForTesting("Test Value"),
									PageContext.REQUEST_SCOPE);

		request.setAttribute("runTest", whichTest);
		try {
			pageContext.forward("/test/org/hdiv/taglib/html/TestRadioTag1.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			fail("There is a problem that is preventing the tests to continue!");
		}
	}

	/*
	 * Testing RadioTag.
	 */
	public void testRadioProperty() throws Exception {
		runMyTest("testRadioProperty", "");
	}

	public void testRadioPropertyAccesskey() throws Exception {
		runMyTest("testRadioPropertyAccesskey", "");
	}

	public void testRadioPropertyAlt() throws Exception {
		runMyTest("testRadioPropertyAlt", "");
	}

	public void testRadioPropertyAltKey1() throws Exception {
		runMyTest("testRadioPropertyAltKey1", "");
	}

	public void testRadioPropertyAltKey2() throws Exception {
		runMyTest("testRadioPropertyAltKey2", "");
	}

    public void testRadioPropertyAltKey3() throws Exception {
        runMyTest("testRadioPropertyAltKey3", "");
    }
    
	public void testRadioPropertyAltKey_fr1() throws Exception {
		runMyTest("testRadioPropertyAltKey1_fr", "fr");
	}

	public void testRadioPropertyAltKey_fr2() throws Exception {
		runMyTest("testRadioPropertyAltKey2_fr", "fr");
	}

	public void testRadioPropertyDisabled() throws Exception {
		runMyTest("testRadioPropertyDisabled", "");
	}

	public void testRadioPropertyOnblur() throws Exception {
		runMyTest("testRadioPropertyOnblur", "");
	}

	public void testRadioPropertyOnchange() throws Exception {
		runMyTest("testRadioPropertyOnchange", "");
	}

	public void testRadioPropertyOnclick() throws Exception {
		runMyTest("testRadioPropertyOnclick", "");
	}

	public void testRadioPropertyOndblclick() throws Exception {
		runMyTest("testRadioPropertyOndblclick", "");
	}

	public void testRadioPropertyOnfocus() throws Exception {
		runMyTest("testRadioPropertyOnfocus", "");
	}

	public void testRadioPropertyOnkeydown() throws Exception {
		runMyTest("testRadioPropertyOnkeydown", "");
	}

	public void testRadioPropertyOnkeypress() throws Exception {
		runMyTest("testRadioPropertyOnkeypress", "");
	}

	public void testRadioPropertyOnkeyup() throws Exception {
		runMyTest("testRadioPropertyOnkeyup", "");
	}

	public void testRadioPropertyOnmousedown() throws Exception {
		runMyTest("testRadioPropertyOnmousedown", "");
	}

	public void testRadioPropertyOnmousemove() throws Exception {
		runMyTest("testRadioPropertyOnmousemove", "");
	}

	public void testRadioPropertyOnmouseout() throws Exception {
		runMyTest("testRadioPropertyOnmouseout", "");
	}

	public void testRadioPropertyOnmouseover() throws Exception {
		runMyTest("testRadioPropertyOnmouseover", "");
	}

	public void testRadioPropertyOnmouseup() throws Exception {
		runMyTest("testRadioPropertyOnmouseup", "");
	}

}
