package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int antall) {

		// TODO - START
		this.gpspoints = new GPSPoint[antall];
		this.antall    = 0;
		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;

		// TODO - START
		if (this.antall < gpspoints.length) {
			this.gpspoints[this.antall] = gpspoint;
			this.antall++;
			inserted = true;
		}
		
		return inserted;
		// TODO - SLUTT
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;

		// TODO - START
		gpspoint = GPSDataConverter.convert(time, latitude, longitude, elevation);
		
		return insertGPS(gpspoint);
		// TODO - SLUTT
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START
		for (GPSPoint gps : this.gpspoints) {
			System.out.print(gps.toString());
		}
		// TODO - SLUTT
		System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
