package timelineparser

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.io.InputStream

class Downloader {
	
	
	public fun start() {
		val gson: Gson = GsonBuilder().create();
		val file = File("D:\\Standortverlauf.json");
		val reader = file.reader(Charsets.UTF_8);
		val locations = gson.fromJson(reader,Locations::class.java);
		for(loc in locations.locations) {
			System.out.println(loc);
		}
	}
}