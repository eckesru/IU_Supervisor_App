package de.iu.iwmb02_iu_betreuer_app.development;

public interface DatabaseTools {
    void deleteStudentsDB();
    void deleteSupervisorDB();
    void deleteThesesDB();
    void deleteUserDB();
    void deleteAllDBs();
    void populateDatabasesWithSampleData();
}
