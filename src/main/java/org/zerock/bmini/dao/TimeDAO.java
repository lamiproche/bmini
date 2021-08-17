package org.zerock.bmini.dao;

public enum TimeDAO {

    INSTANCE;

    private static final String SQL_TIME = "select now()";

    StringBuffer buffer = new StringBuffer();

    public String selectTime() {
        new JdbcTemplate() {
            @Override
            protected void execute() throws Exception {
                preparedStatement = connection.prepareStatement(SQL_TIME);
                resultSet = preparedStatement.executeQuery();

                resultSet.next();
                buffer.append(resultSet.getString(1));
            }
        }.makeAll();

        return buffer.toString();
    }
}
