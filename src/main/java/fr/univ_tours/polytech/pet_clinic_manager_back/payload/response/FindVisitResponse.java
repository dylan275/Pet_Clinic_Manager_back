package fr.univ_tours.polytech.pet_clinic_manager_back.payload.response;

import fr.univ_tours.polytech.pet_clinic_manager_back.models.Visit;

public class FindVisitResponse {
    private Visit visit;

    public FindVisitResponse(Visit visit) {
        this.visit = visit;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}
