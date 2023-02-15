package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.ButterRoti;
import com.xworkz.inheritance.things.JowarRoti;
import com.xworkz.inheritance.things.Kulcha;
import com.xworkz.inheritance.things.Naan;
import com.xworkz.inheritance.things.OnionMasalaRagiRoti;
import com.xworkz.inheritance.things.OnionRagiRoti;
import com.xworkz.inheritance.things.RagiRoti;
import com.xworkz.inheritance.things.Roti;

public class RotiRunner {

	public static void main(String[] args) {

		OnionMasalaRagiRoti masala = new OnionMasalaRagiRoti();
		float thickness = masala.getThickness();
		System.out.println(thickness);
		float weight = masala.getWeight();
		System.out.println(weight);
		double calorie = masala.getCalorie();
		System.out.println(calorie);
		String shape = masala.getShape();
		System.out.println(shape);

		System.out.println("          ");

		OnionRagiRoti ragi = new OnionMasalaRagiRoti();
		float weight1 = ragi.getWeight();
		System.out.println(weight1);
		double calorie1 = ragi.getCalorie();
		System.out.println(calorie1);
		String shape1 = ragi.getShape();
		System.out.println(shape1);

		if (ragi instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti = (OnionMasalaRagiRoti) ragi;
			float thickness1 = onionMasalaRagiRoti.getThickness();
			System.out.println(thickness1);

		} else {
			System.err.println("ragi is not pointing OnionRagiRoti");
		}

		System.out.println("          ");

		RagiRoti roti = new OnionMasalaRagiRoti();
		double calorie2 = roti.getCalorie();
		System.out.println(calorie2);
		String shape2 = roti.getShape();
		System.out.println(shape2);

		if (roti instanceof OnionMasalaRagiRoti) {
			OnionRagiRoti onionRagiRoti = (OnionRagiRoti) roti;
			float weight2 = onionRagiRoti.getWeight();
			System.out.println(weight2);

		} else {
			System.err.println("roti is not pointing to the instance of OnionMasalaRagiRoti");
		}

		if (roti instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti1 = (OnionMasalaRagiRoti) roti;
			float thickness2 = onionMasalaRagiRoti1.getThickness();
			System.out.println(thickness2);
		} else {
			System.err.println("roti is not pointing OnionMasalaRagiRoti");
		}

		System.out.println("          ");

		Roti ro = new OnionMasalaRagiRoti();
		String shape3 = ro.getShape();
		System.out.println(shape3);

		if (ro instanceof OnionMasalaRagiRoti) {
			RagiRoti ragiRoti = (RagiRoti) ro;
			double calorie3 = ragiRoti.getCalorie();
			System.out.println(calorie3);
		} else {
			System.err.println("ro is not OnionMasalaRagiRoti");
		}

		if (ro instanceof OnionMasalaRagiRoti) {
			OnionRagiRoti onionRagiRoti1 = (OnionRagiRoti) ro;
			float weight3 = onionRagiRoti1.getWeight();
			System.out.println(weight3);
		} else {
			System.err.println("ro is not OnionMasalaRagiRoti");
		}
		if (ro instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti onionMasalaRagiRoti1 = (OnionMasalaRagiRoti) ro;
			float thickness3 = onionMasalaRagiRoti1.getThickness();
			System.out.println(thickness3);
		} else {
			System.out.println("ro is not OnionMasalaRagiRoti");
		}

		System.out.println("          ");

		OnionRagiRoti ragi1 = new OnionRagiRoti();
		System.out.println(ragi1.getWeight());
		System.out.println(ragi1.getCalorie());
		System.out.println(ragi1.getShape());

		System.out.println("          ");

		RagiRoti roti1 = new OnionRagiRoti();
		System.out.println(roti1.getCalorie());
		System.out.println(roti1.getShape());

		if (roti1 instanceof OnionRagiRoti) {
			OnionRagiRoti onionRagiRoti2 = (OnionRagiRoti) roti1;
			System.out.println(onionRagiRoti2.getWeight());

		} else {
			System.err.println("roti1 is not OnionRagiRoti");
		}

		System.out.println("          ");

		Roti ro1 = new OnionRagiRoti();
		System.out.println(ro1.getShape());

		if (ro1 instanceof OnionRagiRoti) {
			RagiRoti ragiRoti = (RagiRoti) ro1;
			System.out.println(ragiRoti.getCalorie());

		} else {
			System.err.println("ro1 is not nRagiRoti");
		}
		if (ro1 instanceof OnionRagiRoti) {
			OnionRagiRoti oniRagiRoti3 = (OnionRagiRoti) ro1;
			System.out.println(oniRagiRoti3.getWeight());

		} else {
			System.err.println("ro1 is not OnionRagiRoti");
		}

		System.out.println("          ");

		RagiRoti roti2 = new RagiRoti();
		System.out.println(roti2.getShape());
		System.out.println(roti2.getCalorie());

		System.out.println("          ");

		Roti ro2 = new RagiRoti();
		System.out.println(ro2.getShape());

		if (ro2 instanceof RagiRoti) {
			RagiRoti ragiRoti2 = (RagiRoti) ro2;
			System.out.println(ragiRoti2.getCalorie());
		} else {
			System.err.println("ro2 is not RagiRoti");
		}

		System.out.println("          ");

		Roti ro3 = new Roti();
		System.out.println(ro3.getShape());

		System.out.println("=============================");

		JowarRoti jowar = new JowarRoti();
		System.out.println(jowar.getPrice());
		System.out.println(jowar.getLength());
		System.out.println(jowar.getShape());

		System.out.println("          ");

		ButterRoti butter = new JowarRoti();
		System.out.println(butter.getLength());
		System.out.println(butter.getShape());

		if (butter instanceof JowarRoti) {
			JowarRoti jowar1 = (JowarRoti) butter;
			System.out.println(jowar1.getPrice());
		} else {
			System.err.println("butter is not JowarRoti");
		}

		System.out.println("          ");

		Roti ro4 = new JowarRoti();
		System.out.println(ro4.getShape());

		if (ro4 instanceof JowarRoti) {
			ButterRoti butter1 = (ButterRoti) ro4;
			System.out.println(butter1.getLength());

			JowarRoti jowar2 = (JowarRoti) ro4;
			System.out.println(jowar2.getPrice());
		} else {
			System.err.println("ro4 is not JowarRoti");
		}

		System.out.println("         ");

		ButterRoti but = new ButterRoti();
		System.out.println(but.getLength());
		System.out.println(but.getShape());

		System.out.println("         ");

		Roti r = new ButterRoti();
		System.out.println(r.getShape());

		if (r instanceof ButterRoti) {
			ButterRoti butter9 = (ButterRoti) r;
			System.out.println(butter9.getLength());
		} else {
			System.out.println("r is not ButterRoti");
		}

		System.out.println("=============================");

		Kulcha kulcha = new Kulcha();
		System.out.println(kulcha.getTasty());
		System.out.println(kulcha.getDiameter());
		System.out.println(kulcha.getLength());
		System.out.println(kulcha.getShape());

		System.out.println("          ");

		Naan naan = new Kulcha();
		System.out.println(naan.getDiameter());
		System.out.println(naan.getLength());
		System.out.println(naan.getShape());

		if (naan instanceof Kulcha) {
			Kulcha kulcha2 = (Kulcha) naan;
			System.out.println(kulcha2.getTasty());

		} else {
			System.err.println("naan is not Kulcha");
		}

		System.out.println("          ");

		ButterRoti butter2 = new Kulcha();
		System.out.println(butter2.getLength());
		System.out.println(butter2.getShape());

		if (butter2 instanceof Kulcha) {
			Naan naan1 = (Naan) butter2;
			System.out.println(naan1.getDiameter());

			Kulcha kulcha3 = (Kulcha) butter2;
			System.out.println(kulcha3.getTasty());
		} else {
			System.err.println("butter2 is not Kulcha");
		}

		System.out.println("          ");

		Roti ro5 = new Kulcha();
		System.out.println(ro5.getShape());

		if (ro5 instanceof Kulcha) {
			ButterRoti butter3 = (ButterRoti) ro5;
			System.out.println(butter3.getLength());

			Naan naan2 = (Naan) butter3;
			System.out.println(naan2.getDiameter());

			Kulcha kulcha4 = (Kulcha) butter3;
			System.out.println(kulcha4.getTasty());
		} else {
			System.err.println("ro5 is not Kulcha");
		}

		System.out.println("=============================");

		Naan naan3 = new Naan();
		System.out.println(naan3.getDiameter());
		System.out.println(naan3.getLength());
		System.out.println(naan3.getShape());

		System.out.println("          ");

		ButterRoti butter4 = new Naan();
		System.out.println(butter4.getLength());
		System.out.println(butter4.getShape());

		if (butter4 instanceof Naan) {
			Naan naan4 = (Naan) butter4;
			System.out.println(naan4.getDiameter());

		} else {
			System.err.println("butter4 is not Naan");
		}

		System.out.println("          ");

		Roti ro6 = new Naan();
		System.out.println(ro6.getShape());

		if (ro6 instanceof Naan) {
			ButterRoti butter5 = (ButterRoti) ro6;
			System.out.println(butter5.getLength());

			Naan naan5 = (Naan) ro6;
			System.out.println(naan5.getDiameter());

		} else {
			System.out.println("ro6 is not Naan");
		}

	}

}
