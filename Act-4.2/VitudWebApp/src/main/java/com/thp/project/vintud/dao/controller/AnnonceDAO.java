package com.thp.project.vintud.dao.controller;


public interface AnnonceDAO {
	void DeposerAnnonce (AnnouncementImpl annoce);
	void ConsulterAnnonceDispo (int id);
	void ModifierAnnonce (AnnouncementImpl annoce);
	void SupprimerAnnonce (int id);
}