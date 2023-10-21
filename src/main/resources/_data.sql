CREATE TABLE email_subscriptions (
    subscription_id SERIAL PRIMARY KEY,
    email_address VARCHAR(255) NOT NULL,
    subscription_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
INSERT INTO email_subscriptions (email_address) VALUES ('dev@operationbharat.com'),  ('asman@operationbharat.com');

-- Create the contact_types table
CREATE TABLE contact_form_types (
    contact_type_id SERIAL PRIMARY KEY,
    contact_type_name VARCHAR(50) NOT NULL
);
-- Insert contact types
INSERT INTO contact_form_types (contact_type_name) VALUES ('General'), ('Help'), ('Investment'), ('Suggestion');

-- Create the contact_form_queries table
CREATE TABLE contact_form_queries (
    form_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL,
    message TEXT NOT NULL,
    contact_type_id INT REFERENCES contact_form_types(contact_type_id),
    submission_time TIMESTAMPTZ DEFAULT NOW()
);
-- Create the blog post categories table
CREATE TABLE blog_post_categories (
    category_id SERIAL PRIMARY KEY,
    category_name VARCHAR(50) NOT NULL
);
-- Insert some sample categories
INSERT INTO blog_post_categories (category_name) VALUES ('News'), ('Announcement');

-- Create the blog_posts table
CREATE TABLE blog_posts (
    post_id SERIAL PRIMARY KEY,
    post_title VARCHAR(255) NOT NULL,
    post_content TEXT NOT NULL,
    post_author VARCHAR(100),
    post_banner_url VARCHAR(255),
    create_time TIMESTAMPTZ DEFAULT NOW(),
    update_time TIMESTAMPTZ DEFAULT NOW(),
    category_id INT REFERENCES blog_post_categories(category_id)
);