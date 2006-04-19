package com.toedter.calendar;

import java.util.Calendar;

import junit.framework.TestCase;
// JUnitDoclet begin import
import com.toedter.calendar.JYearChooser;

// JUnitDoclet end import

/**
 * Generated by JUnitDoclet, a tool provided by ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org and www.objectfab.de for
 * informations about the tool, the licence and the authors.
 */

public class JYearChooserTest
// JUnitDoclet begin extends_implements
		extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	com.toedter.calendar.JYearChooser jyearchooser = null;

	// JUnitDoclet end class

	public JYearChooserTest(String name) {
		// JUnitDoclet begin method JYearChooserTest
		super(name);
		// JUnitDoclet end method JYearChooserTest
	}

	public com.toedter.calendar.JYearChooser createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new com.toedter.calendar.JYearChooser();
		// JUnitDoclet end method testcase.createInstance
	}

	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		jyearchooser = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		jyearchooser = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	public void testSetGetYear() throws Exception {
		// JUnitDoclet begin method setYear getYear
		int[] tests = { Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE };
		int maximumYear = Calendar.getInstance().getMaximum(Calendar.YEAR);
		for (int i = 0; i < tests.length; i++) {
			jyearchooser.setYear(tests[i]);
			if (tests[i] < 1) {
				assertEquals(1, jyearchooser.getYear());
			} else if (tests[i] > maximumYear) {
				assertEquals(maximumYear, jyearchooser.getYear());
			} else
				assertEquals(tests[i], jyearchooser.getYear());
		}
		// JUnitDoclet end method setYear getYear
	}

	public void testSetValue() throws Exception {
		// JUnitDoclet begin method setValue
		// JUnitDoclet end method setValue
	}

	public void testSetDayChooser() throws Exception {
		// JUnitDoclet begin method setDayChooser
		// JUnitDoclet end method setDayChooser
	}

	public void testSetGetEndYear() throws Exception {
		// JUnitDoclet begin method setEndYear getEndYear
		int[] tests = { Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE };

		for (int i = 0; i < tests.length; i++) {
			jyearchooser.setEndYear(tests[i]);
			assertEquals(tests[i], jyearchooser.getEndYear());
		}
		// JUnitDoclet end method setEndYear getEndYear
	}

	public void testSetGetStartYear() throws Exception {
		// JUnitDoclet begin method setStartYear getStartYear
		int[] tests = { Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE };

		for (int i = 0; i < tests.length; i++) {
			jyearchooser.setStartYear(tests[i]);
			assertEquals(tests[i], jyearchooser.getStartYear());
		}
		// JUnitDoclet end method setStartYear getStartYear
	}

	public void testMain() throws Exception {
		// JUnitDoclet begin method main
		// JUnitDoclet end method main
	}

	/**
	 * JUnitDoclet moves marker to this method, if there is not match for them
	 * in the regenerated code and if the marker is not empty. This way, no test
	 * gets lost when regenerating after renaming. Method testVault is supposed
	 * to be empty.
	 */
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

	public static void main(String[] args) {
		// JUnitDoclet begin method testcase.main
		junit.textui.TestRunner.run(JYearChooserTest.class);
		// JUnitDoclet end method testcase.main
	}
}
