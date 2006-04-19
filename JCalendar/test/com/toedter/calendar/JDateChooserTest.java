package com.toedter.calendar;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

/**
 * Generated by JUnitDoclet, a tool provided by ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org and www.objectfab.de for
 * informations about the tool, the licence and the authors.
 */

public class JDateChooserTest
// JUnitDoclet begin extends_implements
		extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	com.toedter.calendar.JDateChooser jdatechooser = null;

	// JUnitDoclet end class

	public JDateChooserTest(String name) {
		// JUnitDoclet begin method JDateChooserTest
		super(name);
		// JUnitDoclet end method JDateChooserTest
	}

	public com.toedter.calendar.JDateChooser createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new com.toedter.calendar.JDateChooser();
		// JUnitDoclet end method testcase.createInstance
	}

	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		jdatechooser = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		jdatechooser = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	public void testActionPerformed() throws Exception {
		// JUnitDoclet begin method actionPerformed
		// JUnitDoclet end method actionPerformed
	}

	public void testPropertyChange() throws Exception {
		// JUnitDoclet begin method propertyChange
		// JUnitDoclet end method propertyChange
	}

	public void testUpdateUI() throws Exception {
		// JUnitDoclet begin method updateUI
		// JUnitDoclet end method updateUI
	}

	public void testSetLocale() throws Exception {
		// JUnitDoclet begin method setLocale
		// JUnitDoclet end method setLocale
	}

	public void testSetGetDateFormatString() throws Exception {
		// JUnitDoclet begin method setDateFormatString getDateFormatString
		String[] tests = { "dd.MM.yyyy", "MM/dd/yy", new String() };

		for (int i = 0; i < tests.length; i++) {
			jdatechooser.setDateFormatString(tests[i]);
			assertEquals(tests[i], jdatechooser.getDateFormatString());
		}

		String[] tests2 = { null, "MM/xdd/yy" };
		String defaultFormat = ((SimpleDateFormat) DateFormat.getDateInstance(DateFormat.MEDIUM))
				.toPattern();

		for (int i = 0; i < tests2.length; i++) {
			jdatechooser.setDateFormatString(tests2[i]);
			assertEquals(defaultFormat, jdatechooser.getDateFormatString());
		}
		// JUnitDoclet end method setDateFormatString getDateFormatString
	}

	public void testSetGetDate() throws Exception {
		// JUnitDoclet begin method setDate getDate
		Date[] tests = { new Date(), null };

		for (int i = 0; i < tests.length; i++) {
			jdatechooser.setDate(tests[i]);
			assertEquals(tests[i], jdatechooser.getDate());
		}
		// JUnitDoclet end method setDate getDate
	}

	public void testSetGetCalendar() throws Exception {
		// JUnitDoclet begin method setCalendar getCalendar
		Calendar[] tests = { Calendar.getInstance(), null };

		for (int i = 0; i < tests.length; i++) {
			jdatechooser.setCalendar(tests[i]);
			assertEquals(tests[i], jdatechooser.getCalendar());
		}
		// JUnitDoclet end method setCalendar getCalendar
	}

	public void testSetIsEnabled() throws Exception {
		// JUnitDoclet begin method setEnabled isEnabled
		boolean[] tests = { true, false };

		for (int i = 0; i < tests.length; i++) {
			jdatechooser.setEnabled(tests[i]);
			assertEquals(tests[i], jdatechooser.isEnabled());
		}
		// JUnitDoclet end method setEnabled isEnabled
	}

	public void testSetIcon() throws Exception {
		// JUnitDoclet begin method setIcon
		// JUnitDoclet end method setIcon
	}

	public void testMain() throws Exception {
		// JUnitDoclet begin method main
		// JUnitDoclet end method main
	}

	public void testAddPropertyChangeListener() throws Exception {
		// JUnitDoclet begin method addPropertyChangeListener
		class MyListener implements PropertyChangeListener {
			boolean called = false;

			public void propertyChange(PropertyChangeEvent event) {
				called = true;
			}
		}
		MyListener listener = new MyListener();
		JDateChooser chooser = new JDateChooser();
		chooser.addPropertyChangeListener("date", listener);
		chooser.setDate(new Date());
		chooser.setDate(null);
		assertTrue("Listener was not called", listener.called);
		// JUnitDoclet end method addPropertyChangeListener
	}

	public void testRemovePropertyChangeListener() throws Exception {
		// JUnitDoclet begin method removePropertyChangeListener
		// JUnitDoclet end method removePropertyChangeListener
	}

	public void testNullDateWithSpinnerEditor() {
		new JDateChooser(new JCalendar(), null, "", new JSpinnerDateEditor());
	}

	public void testNullDate() {
		JDateChooser jDateChooser = new JDateChooser(new JSpinnerDateEditor());
		jDateChooser.setDate(null);
		assertNull("Date is not null", jDateChooser.getDate());
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
		junit.textui.TestRunner.run(JDateChooserTest.class);
		// JUnitDoclet end method testcase.main
	}
}
