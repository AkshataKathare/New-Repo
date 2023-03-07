package com.xworkz.str.boot;

public class Obj {

	public static void main(String[] args) {
		String place = "Dharwad";
		String city = "Dharwad";
		String state = "Karnataka";
		char[] country = { 'I', 'N', 'D', 'I', 'A' };

		StringBuffer location = new StringBuffer("Dharwad");

		char letter = place.charAt(0);// returns char of the index mentioned.It returns char
		System.out.println(letter);

		System.out.println("      ");

		int code = place.codePointAt(1);// It returns the Unicode of mentioned index only,return type is int
		System.out.println(code);

		System.out.println("       ");

		int code2 = place.codePointBefore(3);// It returns the unicode of character at index before the mentioned one.
		System.out.println(code2);// return type is int

		// int code3=place.codePointAt(2);//the unicode here we get is same as that of
		// before
		// System.out.println(code3);

		System.out.println("       ");

		int count = place.codePointCount(0, place.length());// It returns the no of elements in String
		System.out.println(count);// return type is int

		System.out.println("       ");

		int compared = place.compareTo(state);// It compares two Strings lexicographically
		System.out.println(compared);// return type is int

		System.out.println("       ");

		int ignoreCase = place.compareToIgnoreCase("india");
		System.out.println(ignoreCase);

		System.out.println("       ");

		String concat = place.concat("City");// Its concatinates the string value given
		System.out.println(concat);// return type is String

		System.out.println("       ");

		boolean contain = place.contains(city);// It returns true iff the String value consists of specified sequence of
												// characters
		System.out.println(contain);// return type is boolean

		System.out.println("       ");

		boolean equal = place.contentEquals(city);// Compares this string to the specified CharSequence.
		System.out.println(equal);// return type is boolean

		System.out.println("       ");

		boolean content = place.contentEquals(location);// Compares this string to the specified StringBuffer
		System.out.println(content);// return type is boolean

		System.out.println("       ");

		String copy = place.copyValueOf(country);// Returns a String that represents the character sequence in the array
													// specified.
		System.out.println(copy);// return type is static String

		System.out.println("       ");

		boolean same = place.endsWith("wad");// Tests if this string ends with the specified suffix.
		System.out.println(same);// return type is boolean

		System.out.println("       ");

		boolean same2 = place.equals(city);// Compares this string to the specified object
		System.out.println(same);// return type is boolean

		System.out.println("       ");

		boolean equal2 = place.equalsIgnoreCase("dharwad");// Compares this String to another String, ignoring case
															// considerations
		System.out.println(equal2);// return type is boolean

		System.out.println("       ");

		String format = String.format("Dharwad", city);// Returns a formatted string using the specified format string
														// and arguments.
		System.out.println(format);// return type is String

		System.out.println("       ");

		byte[] getbyt = place.getBytes();// Encodes this String into a sequence of bytes using the platform's default
											// charset, storing the result into a new byte array
		System.out.println(getbyt);// return type is byte[]

		System.out.println("       ");

		int hash = location.hashCode();// Returns a hash code for this string.
		System.out.println(hash);// return type is int

		System.out.println("       ");

		int index = place.indexOf(1);// Returns the index within this string of the first occurrence of the specified
										// character.
		System.out.println(index);// return type is int

		System.out.println("       ");

		int in = place.indexOf(1, 0);// Returns the index within this string of the first occurrence of the specified
										// character, starting the search at the specified index
		System.out.println(in);// return type is int

		System.out.println("       ");

		int mukh = city.indexOf("karnataka");// Returns the index within this string of the first occurrence of the
												// specified substring, starting at the specified index.
		System.out.println(mukh);// return type is int

		System.out.println("       ");

		String intern = city.intern();// Returns a canonical representation for the string object.
		System.out.println(intern);// return type is String

		System.out.println("       ");

		String size = "";

		boolean khare = size.isEmpty();// Returns true if, and only if, length() is 0.
		System.out.println(khare);// return type is boolean

		System.out.println("       ");

		int last = place.lastIndexOf(2);// Returns the index within this string of the last occurrence of the specified
										// character.
		System.out.println(last);// return type is int

		System.out.println("       ");

		int of = state.lastIndexOf(3, 1);// Returns the index within this string of the last occurrence of the specified
											// character, searching backward starting at the specified index
		System.out.println(of);// return type is int

		System.out.println("       ");

		int wild = state.lastIndexOf("karnataka");// Returns the index within this string of the last occurrence of the
													// specified substring.
		System.out.println(wild);// return type is int

		System.out.println("       ");

		int man = place.lastIndexOf("mansik", 2);// Returns the index within this string of the last occurrence of the
													// specified substring, searching backward starting at the specified
													// index.
		System.out.println(man);// return type is int

		System.out.println("       ");

		int len = place.length();// Returns the length of this string.
		System.out.println(len);// return type is int

		System.out.println("       ");

		boolean match = place.matches(city);// Tells whether or not this string matches the given regular expression.
		System.out.println(match);// return type is boolean

		System.out.println("       ");

		String replaced = place.replace('h', 'r');// Returns a new string resulting from replacing all occurrences of
													// oldChar in this string with newChar.
		System.out.println(replaced);// return type is String

		System.out.println("       ");

		String re = place.replace("wad", "war");// Replaces each substring of this string that matches the literal
												// target sequence with the specified literal replacement sequence.
		System.out.println(re);// return type is re

		System.out.println("       ");

		String place3 = place.replaceAll("Dharwad", "Shimoga");// Replaces each substring of this string that matches
																// the given regular expression with the given
																// replacement.
		System.out.println(place3);// return type is String

		System.out.println("       ");

		String rep = place.replaceFirst("Dh", "Ah");// Replaces the first substring of this string that matches the
													// given regular expression with the given replacement.
		System.out.println(rep);// return type is String

		System.out.println("       ");

		String s = "You are beautiful";
		// System.out.println(s.toString());
		String[] name = s.split(" ");// Splits this string around matches of the given regular expression.
		for (String str : name) {
			System.out.println(str);// return type is String[]
		}

		System.out.println("       ");

		boolean start = place.startsWith("Dh");// Tests if this string starts with the specified prefix.
		System.out.println(start);// return type is boolean

		System.out.println("       ");

		boolean same3 = place.startsWith("Dh", 0);// Tests if the substring of this string beginning at the specified
													// index starts with the specified prefix.
		System.out.println(same3);// return type is boolean

		System.out.println("       ");

		CharSequence sub = place.subSequence(0, 3);// Returns a new character sequence that is a subsequence of this
													// sequence.
		System.out.println(sub);// return CharSequence

		System.out.println("       ");

		String str2 = place.substring(1);// Returns a new string that is a substring of this string.
		System.out.println(str2);// return type is String

		System.out.println("       ");

		char[] arr = place.toCharArray();// Converts this string to a new character array.
		System.out.println(arr);// return type is char[]

		System.out.println("       ");

		String lower = place.toLowerCase();// Converts all of the characters in this String to lower case using the
											// rules of the default locale.
		System.out.println(lower);// return type is String

		System.out.println("       ");

		String ash = place.toString();// This object (which is already a string!) is itself returned.
		System.out.println(ash);// return type is String

		System.out.println("       ");

		String upper = place.toUpperCase();// Converts all of the characters in this String to upper case using the
											// rules of the default locale.
		System.out.println(upper);// return type is String

		System.out.println("       ");

		String myMother = "Vimal Kathare";// Returns a copy of the string, with leading and trailing whitespace omitted.
		String tr = myMother.trim();// return type is String
		System.out.println(tr);

		System.out.println("       ");

		boolean married = true;
		String mar = String.valueOf(married);// Returns the string representation of the boolean argument.
		System.out.println(mar);// return type is boolean

		System.out.println("       ");

		char ne = 'd';

		String cou = String.valueOf(ne);//
		System.out.println(ne);// return type is String

		System.out.println("       ");

		String ar = String.valueOf(arr);// Returns the string representation of the char array argument.
		System.out.println(ar);// return type is String

		System.out.println("       ");

		String val = String.valueOf(39.5);// Returns the string representation of the double argument.
		System.out.println(val);// return type is String

		System.out.println("       ");

		String lan = String.valueOf(20.4);// Returns the string representation of the float argument.
		System.out.println(lan);// return type is String

		System.out.println("       ");

		String i = String.valueOf(2);// Returns the string representation of the int argument.
		System.out.println(i);// return type is String

		System.out.println("       ");

		String leo = String.valueOf(3002245);// Returns the string representation of the long argument.
		System.out.println(leo);// return type is String

		System.out.println("       ");

		String ob = String.valueOf(state);// Returns the string representation of the Object argument.
		System.out.println(ob);// return type is String

		System.out.println("       ");

		System.out.println(place.substring(0, 1).toLowerCase() + place.substring(1, 4)
				+ place.substring(4, place.length()).toUpperCase());

		String sentence2 = "You are good and very good";
		String[] count2 = sentence2.split(" ");
		int length = count2.length;
		System.out.println(length);

		boolean present = false;
		int wordCount = 0;
		for (String s1 : count2) {
			present = s.contains("good");
			if (present == true) {
				wordCount ++;
			}
		}
		System.out.println(wordCount);

	}

}
