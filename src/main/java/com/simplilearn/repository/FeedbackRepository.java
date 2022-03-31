package com.simplilearn.repository;



import org.springframework.data.repository.CrudRepository;

import com.simplilearn.model.FeedbackEntity;

public interface FeedbackRepository extends CrudRepository<FeedbackEntity, Long> {

}