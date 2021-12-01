package com.patrickestudosdio.heroesapi.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "Heroes_Table")
public class Heroes {
    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBAttribute(attributeName = "name")
    private String name;
    @DynamoDBAttribute(attributeName = "universe")
    private String universe;
    @DynamoDBAttribute(attributeName = "films")
    private int films;
}
