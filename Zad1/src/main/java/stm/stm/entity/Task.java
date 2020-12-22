package stm.stm.entity;

        import javax.persistence.*;
        import java.sql.Timestamp;

@Entity
@Table
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int taskId;

    @Column
    private String title;
    @Column
    private String description;
    @Column(columnDefinition="timestamp default CURRENT_TIMESTAMP")
    private Timestamp dateAdded;
    @Column
    @Enumerated(EnumType.STRING)
    private stm.stm.enumy.type type;
    @Column
    @Enumerated(EnumType.STRING)
    private stm.stm.enumy.status status;

}
