package com.vintud;

public interface AnnonceDAO {
	void DeposerAnnonce (AnnouncementImpl annoce);
	void ConsulterAnnonceDispo ();
	void ModifierAnnonce (AnnouncementImpl annoce);
	void SupprimerAnnonce (int id);
}
