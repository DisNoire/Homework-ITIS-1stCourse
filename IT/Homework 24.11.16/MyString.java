package com.company;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by DisNoire on 30.11.2016.
 * @author DisNoire
 * @version 1.0
 */
public class MyString {
    /**
     * The value is used for character storage.
     */
    private char[] charArray;

    /**
     * Initializes a newly created object so that it represents
     * an empty character sequence.
     */
    public MyString() {
        charArray = new char[0];
    }

    /**
     * Initializes a newly created object so that it represents the sequence of
     * characters currently contained in the character array argument.
     *
     * @param charSequence The initial char sequences of the string
     */
    public MyString(char[] charSequence) {
        this.charArray = charSequence;
    }

    /**
     * Initializes a newly created object so that it represents the characters
     * sequence of String argument.
     *
     * @param string
     * The initial value of the {@link java.lang.String String}.
     */
    public MyString(String string) {
        charArray = string.toCharArray();
    }

    /**
     * Initializes a newly created object so that it represents
     * the same sequence of characters as the argument.
     * @param string MyString
     */
    public MyString(MyString string) {
        charArray = string.toCharArray();
    }

    /**
     * Concatenates the specified string to the end of this string.
     *
     * @param string the MyString that is concatenated to the end
     *                of this MyString.
     * @return a string that represents the concatenation of this object's
     *          characters followed by the string argument's characters.
     */
    public MyString concatenate(MyString string) {
        int length = string.length();
        if (length == 0) {
            return this;
        }
        int length1 = charArray.length;
        char temp[] = Arrays.copyOf(charArray, length1 + length);
        System.arraycopy(string.charArray, 0, temp, length1, length);
        return new MyString(temp);
    }

    /**
     * Converts this string to a new character array.
     *
     * @return a new character array whose length is the length
     *          of this string and whose contents are initialized to contain
     *          the character sequence represented by this string.
     */
    public char[] toCharArray() {
        return charArray;
    }

    /**
     * Returns the char value at the specified index.
     *
     * @param index the index of the char value.
     * @return     the char value at the specified index of this string.
     * @exception  StringIndexOutOfBoundsException  if index
     *             argument is negative or larger than the length of this
     *             string.
     */
    public char charAt(int index) {
        if ((index-1 < 0) || (index-1 >= charArray.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return charArray[index-1];
    }

    /**
     * Returns the index within this string of the first appearance of the
     * specified substring.
     *
     * @param line the substring to search for.
     * @return the index of the first appearance of the specified substring,
     *          or -1 if there is no such appearance.
     */
    public int indexOf(MyString line) {
        int length = charArray.length;
        int h = 0;

        for (int i = 0; i < length; i++) {
            if (charArray[i] != line.charArray[0]) continue;
            for (int j = 0; j < line.length(); j++) {
                if (i + j < length && charArray[i + j] == line.charArray[j]) h++;
                else break;
            }
            if (h == line.length()) return i;
            else h = 0;
        }
        return -1;
    }

    /**
     * Returns a string that is a substring of this string.
     *
     * @param beginIndex the beginning index.
     * @param length the length.
     * @return the specified substring.
     * @exception  StringIndexOutOfBoundsException  if the
     *             beginIndex is negative, or
     *             sum of beginIndex and length is larger than the length of
     *             this MyString object, or
     *             length is negative.
     */
    public MyString substring(int beginIndex, int length) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (length + beginIndex > charArray.length) {
            throw new StringIndexOutOfBoundsException(beginIndex + length);
        }
        if (length < 0) {
            throw new StringIndexOutOfBoundsException(length);
        }
        if ((beginIndex == 0) && (length + beginIndex == charArray.length)) {
            return this;
        }
        char result[] = new char[length];
        System.arraycopy(charArray, beginIndex, result, 0, length);
        return new MyString(result);
    }

    /**
     * Returns the length of this string.
     * The length is equal to the number of
     * characters in the string.
     *
     * @return  the length of the sequence of characters represented by this
     *          object.
     */
    public int length() {
        return charArray.length;
    }

    /**
     * Splits this string around matches of
     * the given character.
     *
     * @param delimiter the delimiting character.
     * @return the array of strings computed by splitting this string
     *          around matches of the given character.
     */
    public MyString[] split(char delimiter) {
        ArrayList<MyString> list = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == delimiter) {
                if (start != i) {
                    list.add(substring(start, i - start));
                }
                start = i + 1;
            } else if (i == charArray.length - 1) {
                list.add(substring(start, i - start + 1));
            }
        }
        MyString[] splitted = new MyString[list.size()];
        return list.toArray(splitted);
    }

    @Override
    public String toString() {
        return new String(charArray);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyString myString = (MyString) o;

        return Arrays.equals(charArray, myString.charArray);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(charArray);
    }
}
