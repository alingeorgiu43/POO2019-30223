package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal {
	public Integer nrOfLegs;
	public String name;
	public final double maintenanceCost;
	public final double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(Integer nrOfLegs, String name, double dangerPerc, double maintenanceCost) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.dangerPerc = dangerPerc;
		this.maintenanceCost = maintenanceCost;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public boolean getIsTakenCareOf() {
		return this.takenCareOf;
	}

	public void setIsTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() {
		Random rand = new Random();
		double interactionDanger = rand.nextDouble() * 1;
		if (interactionDanger < this.dangerPerc)
			return true;
		else
			return false;
	}

}
