package se.hiq.kodarskolan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookFromFileCreator {

	public enum ErrCode
	{
		ErrNoError,
		ErrFileOpenError
	}

	public ErrCode storeBooks(String path) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));

			String line = br.readLine();

			while(line != null) {
				String[] split = line.split(" ");
				Author author = new Author(split[0], split[1]);
				Book book = new Book(author, split[2], split[3]);
				store(book);
			}

			br.close();
		} catch (Exception e) {
			return ErrCode.ErrFileOpenError;
		}

		return ErrCode.ErrNoError;
	}


	/*
	 * Stores the book, and throws an exception if the book could not be stored
	 */
	private void store(Book book) throws Exception {
		// Store the book
	}
}
