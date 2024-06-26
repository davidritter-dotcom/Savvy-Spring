/*
 * This file is generated by jOOQ.
 */
package ch.ffhs.savvy_spring.jooq.model.tables.records;


import ch.ffhs.savvy_spring.jooq.model.tables.Diaryentry;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DiaryentryRecord extends UpdatableRecordImpl<DiaryentryRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.diaryentry.entryid</code>.
     */
    public DiaryentryRecord setEntryid(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.diaryentry.entryid</code>.
     */
    public Integer getEntryid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.diaryentry.content</code>.
     */
    public DiaryentryRecord setContent(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.diaryentry.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.diaryentry.title</code>.
     */
    public DiaryentryRecord setTitle(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.diaryentry.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.diaryentry.user_id</code>.
     */
    public DiaryentryRecord setUserId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.diaryentry.user_id</code>.
     */
    public String getUserId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Diaryentry.DIARYENTRY.ENTRYID;
    }

    @Override
    public Field<String> field2() {
        return Diaryentry.DIARYENTRY.CONTENT;
    }

    @Override
    public Field<String> field3() {
        return Diaryentry.DIARYENTRY.TITLE;
    }

    @Override
    public Field<String> field4() {
        return Diaryentry.DIARYENTRY.USER_ID;
    }

    @Override
    public Integer component1() {
        return getEntryid();
    }

    @Override
    public String component2() {
        return getContent();
    }

    @Override
    public String component3() {
        return getTitle();
    }

    @Override
    public String component4() {
        return getUserId();
    }

    @Override
    public Integer value1() {
        return getEntryid();
    }

    @Override
    public String value2() {
        return getContent();
    }

    @Override
    public String value3() {
        return getTitle();
    }

    @Override
    public String value4() {
        return getUserId();
    }

    @Override
    public DiaryentryRecord value1(Integer value) {
        setEntryid(value);
        return this;
    }

    @Override
    public DiaryentryRecord value2(String value) {
        setContent(value);
        return this;
    }

    @Override
    public DiaryentryRecord value3(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public DiaryentryRecord value4(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public DiaryentryRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DiaryentryRecord
     */
    public DiaryentryRecord() {
        super(Diaryentry.DIARYENTRY);
    }

    /**
     * Create a detached, initialised DiaryentryRecord
     */
    public DiaryentryRecord(Integer entryid, String content, String title, String userId) {
        super(Diaryentry.DIARYENTRY);

        setEntryid(entryid);
        setContent(content);
        setTitle(title);
        setUserId(userId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised DiaryentryRecord
     */
    public DiaryentryRecord(ch.ffhs.savvy_spring.jooq.model.tables.pojos.Diaryentry value) {
        super(Diaryentry.DIARYENTRY);

        if (value != null) {
            setEntryid(value.getEntryid());
            setContent(value.getContent());
            setTitle(value.getTitle());
            setUserId(value.getUserId());
            resetChangedOnNotNull();
        }
    }
}
