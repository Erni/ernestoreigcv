package es.erni.demo.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import es.erni.demo.client.place.AdditionalInfoPlace;
import es.erni.demo.client.place.CareerOverviewPlace;
import es.erni.demo.client.place.EducationPlace;
import es.erni.demo.client.place.JobDetailPlace;
import es.erni.demo.client.place.KeyStrengthsPlace;
import es.erni.demo.client.place.ProfExpPlace;
import es.erni.demo.client.place.PublicationsPlace;
import es.erni.demo.client.place.TechSkillsPlace;

@WithTokenizers({
	CareerOverviewPlace.Tokenizer.class,
	KeyStrengthsPlace.Tokenizer.class,
	TechSkillsPlace.Tokenizer.class,
	ProfExpPlace.Tokenizer.class,
	JobDetailPlace.Tokenizer.class,
	EducationPlace.Tokenizer.class,
	AdditionalInfoPlace.Tokenizer.class,
	PublicationsPlace.Tokenizer.class
})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
