package com.abdelhakim.etablissements.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.checkerframework.checker.confidential.qual.*;

@Entity(tableName = "etablissements")
public class Etablissement {

    @PrimaryKey(autoGenerate = true)
    private @NonConfidential int id;

    @ColumnInfo(name = "label")
    private @NonConfidential String label;

    @ColumnInfo(name = "name")
    private @NonConfidential String name;

    @ColumnInfo(name = "imag")
    private @NonConfidential int imag;

    @ColumnInfo(name = "isPublic")
    private @NonConfidential boolean isPublic;

    public Etablissement(@NonConfidential String label, @NonConfidential String name, @NonConfidential int imag, @NonConfidential boolean isPublic) {
        this.label = label;
        this.name = name;
        this.imag = imag;
        this.isPublic = isPublic;
    }

    public @NonConfidential int getId() {
        return id;
    }

    public void setId(@NonConfidential int id) {
        this.id = id;
    }

    public @NonConfidential String getLabel() {
        return label;
    }

    public void setLabel(@NonConfidential String label) {
        this.label = label;
    }

    public @NonConfidential String getName() {
        return name;
    }

    public void setName(@NonConfidential String name) {
        this.name = name;
    }

    public @NonConfidential int getImag() {
        return imag;
    }

    public void setImag(@NonConfidential int imag) {
        this.imag = imag;
    }

    public @NonConfidential boolean isPublic() {
        return isPublic;
    }

    public void setPublic(@NonConfidential boolean aPublic) {
        isPublic = aPublic;
    }
}
