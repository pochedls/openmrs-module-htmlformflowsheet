package org.openmrs.module.htmlformflowsheet.web;

public class EncounterTabModel {

    private Integer count;
    private Integer patientId;
    private Integer encounterTypeId;
    private Integer formId;
    boolean showAddAnother = true;
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getPatientId() {
        return patientId;
    }
    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    public Integer getEncounterTypeId() {
        return encounterTypeId;
    }
    public void setEncounterTypeId(Integer encounterTypeId) {
        this.encounterTypeId = encounterTypeId;
    }
    public Integer getFormId() {
        return formId;
    }
    public void setFormId(Integer formId) {
        this.formId = formId;
    }
    public boolean isShowAddAnother() {
        return showAddAnother;
    }
    public boolean getShowAddAnother() {
        return showAddAnother;
    }
    public void setShowAddAnother(boolean showAddAnother) {
        this.showAddAnother = showAddAnother;
    }
    
    
    
    
}
