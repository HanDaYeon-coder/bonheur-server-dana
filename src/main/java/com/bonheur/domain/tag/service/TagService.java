package com.bonheur.domain.tag.service;

import com.bonheur.domain.tag.model.Tag;

import java.util.List;

public interface TagService {
    List<Tag> createTag(List<String> tags);
}
