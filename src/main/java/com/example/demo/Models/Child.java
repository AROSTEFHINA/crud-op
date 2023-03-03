package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Artist_details")

public class Child {

@Id
@Column(name="ArtistId")
private int ArtistId;
@Column(name="ArtistFirstName")
private String ArtistFirstName;
@Column(name="ArtistLastName")
private String ArtistLastName;
@Column(name="Genre")
private String Genre;
@Column(name="Art")
private String Art;
public int getArtistId() {
	return ArtistId;
}


public void setArtistId(int artistId) {
	ArtistId = artistId;
}


public String getArtistFirstName() {
	return ArtistFirstName;
}


public void setArtistFirstName(String artistFirstName) {
	ArtistFirstName = artistFirstName;
}


public String getArtistLastName() {
	return ArtistLastName;
}


public void setArtistLastName(String artistLastName) {
	ArtistLastName = artistLastName;
}


public String getGenre() {
	return Genre;
}


public void setGenre(String genre) {
	Genre = genre;
}


public String getArt() {
	return Art;
}


public void setArt(String art) {
	Art = art;
}

public Child(int artistId, String artistFirstName, String artistLastName, String genre, String art) {
	super();
	ArtistId = artistId;
	ArtistFirstName = artistFirstName;
	ArtistLastName = artistLastName;
	Genre = genre;
	Art = art;
}

public Child()
{

}
public String toString()
{
return "ArtistId= "+ArtistId+" ArtistFirstName= "+ArtistFirstName+
"ArtistLastName= "+ArtistLastName+" Genre= "+Genre+
" Art= "+Art;
}
}
