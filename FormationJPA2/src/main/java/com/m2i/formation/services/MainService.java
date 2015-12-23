package com.m2i.formation.services;

import javax.persistence.*;
import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.*;

public class MainService implements IMainService {

	private MediaRepository2 mediaRepository;
	private AuthorRepository authorRepository;
	

	public MediaRepository2 getMediaRepository() {
		return mediaRepository;
	}
	public void setMediaRepository(MediaRepository2 mediaRepository) {
		this.mediaRepository = mediaRepository;
	}
	public AuthorRepository getAuthorRepository() {
		return authorRepository;
	}
	public void setAuthorRepository(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	/* (non-Javadoc)
	 * @see com.m2i.formation.services.IService#addAuthorToMedia(com.m2i.formation.media.entities.Author, int)
	 */
	@Override
	public void addAuthorToMedia(Author a, int mediaId) throws ServiceException {

		/*EntityManagerFactory emf = EMFSingleton.getInstance();
		EntityManager em = emf.createEntityManager();
		mediaRepository = new MediaRepository2();
		mediaRepository.setEntityManager(em);*/
		Media m = mediaRepository.getById(mediaId);
		if (m != null) {

			if (!m.getAuthors().contains(a)) {
				m.getAuthors().add(a);
				mediaRepository.getTransaction();
				mediaRepository.save(m);
				mediaRepository.commit();
				
			} else {
				throw new ServiceException("Author already assiciated with the media");
			}
		} else {
			throw new ServiceException("The media does not exist");

		}

	}

}
