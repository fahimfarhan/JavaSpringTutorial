package com.soumic.notifications.a_model;

import com.soumic.notifications.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // generate getter, setter, constructor, etc
@Builder // builder pattern
@NoArgsConstructor  // self-explanatory
@AllArgsConstructor // self-explanatory
@Entity  // because this is a db model
public class NotificationModel {
  @Id
  @SequenceGenerator(
      name = Constants.NOTIFICATION_ID_SEQUENCE,
      sequenceName = Constants.NOTIFICATION_ID_SEQUENCE
  )
  @GeneratedValue(
      strategy = GenerationType.SEQUENCE,
      generator = Constants.NOTIFICATION_ID_SEQUENCE
  )
  private int id;
  private String title;
  private String subTitle;
}
