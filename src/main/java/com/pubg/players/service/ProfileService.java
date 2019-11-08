package com.pubg.players.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pubg.players.entity.Profile;

@Service
public interface ProfileService {

	public Profile createProfile(Profile profile);

	public List<Profile> getAllProfiles();

	public Profile getProfileByName(String name);

	public Profile getProfileWithHighestKills();

	public Profile modifyProfile(Profile profile);

	public Profile deleteProfile(String name);

}
