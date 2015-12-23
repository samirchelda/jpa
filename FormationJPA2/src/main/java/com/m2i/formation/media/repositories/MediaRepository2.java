package com.m2i.formation.media.repositories;
import java.util.List;
import com.m2i.formation.media.entities.Media;




public class MediaRepository2 extends AbstractRepository<Media> {

	public List<Media> getByPrice(double price) {

		return getByJPQL("Select * from Media e where e.price <=" + price);
	}

}
