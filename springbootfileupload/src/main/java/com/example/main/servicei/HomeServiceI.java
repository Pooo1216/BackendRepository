package com.example.main.servicei;

import java.util.List;

import com.example.main.model.Document;

public interface HomeServiceI {

	public Document saveDocument(Document dd);

	public Iterable<Document> getdata();

	public void deletedata(Document d);

}
