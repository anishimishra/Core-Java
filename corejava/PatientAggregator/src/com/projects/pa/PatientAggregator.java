package com.projects.pa;

import com.projects.pb.PatientBilling;
import com.projects.pc.PatientClinicals;
import com.projects.pr.PatientRegistration;

public class PatientAggregator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientRegistration pr = new PatientRegistration();
		pr.registerPatient();
		PatientClinicals pc = new PatientClinicals();
		pc.clinic();
		PatientBilling pb = new PatientBilling();
		pb.bill();
	}

}
