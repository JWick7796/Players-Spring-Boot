package com.pubg.players.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pubg.players.entity.Profile;
import com.pubg.players.repository.ProfileRepository;
import com.pubg.players.service.ProfileService;

@Service
public class ServiceImpl implements ProfileService {

	@Autowired
	ProfileRepository repository;

	@Override
	public Profile createProfile(Profile profile) {
		return repository.save(profile);
	}

	@Override
	public List<Profile> getAllProfiles() {
		return repository.findAll();
	}

	@Override
	public Profile getProfileByName(String name) {
		return repository.getProfileByUserName(name);
	}

	@Override
	public Profile getProfileWithHighestKills() {
		return repository.findAll(Sort.by(Sort.Direction.DESC, "highestKills")).get(0);

	}

	@Override
	public Profile modifyProfile(Profile profile) {
		return repository.saveAndFlush(profile);
	}

	@Override
	public Profile deleteProfile(String name) {
		repository.delete(repository.getProfileByUserName(name));
		return repository.getProfileByUserName(name);
	}

}
