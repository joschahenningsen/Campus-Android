package de.tum.in.tumcampusapp.component.ui.studyroom;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import de.tum.in.tumcampusapp.component.ui.studyroom.model.StudyRoom;

@Dao
public interface StudyRoomDao {

    @Query("SELECT * FROM study_rooms WHERE group_id = :groupId")
    List<StudyRoom> getAll(int groupId);

    @Query("DELETE FROM study_rooms")
    void removeCache();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(StudyRoom... studyRooms);

}
